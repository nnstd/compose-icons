package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AngleRight: ImageVector
    get() {
        if (_AngleRight != null) {
            return _AngleRight!!
        }
        _AngleRight = ImageVector.Builder(
            name = "AngleRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                moveTo(7f, 17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _AngleRight!!
    }

@Suppress("ObjectPropertyName")
private var _AngleRight: ImageVector? = null
