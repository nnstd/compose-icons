package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BedEmpty: ImageVector
    get() {
        if (_BedEmpty != null) {
            return _BedEmpty!!
        }
        _BedEmpty = ImageVector.Builder(
            name = "BedEmpty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 7f)
            }
        }.build()

        return _BedEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _BedEmpty: ImageVector? = null
