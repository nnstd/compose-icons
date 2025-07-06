package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Looks: ImageVector
    get() {
        if (_Looks != null) {
            return _Looks!!
        }
        _Looks = ImageVector.Builder(
            name = "Looks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 17f)
                horizontalLineTo(3f)
                curveTo(3f, 12.04f, 7.04f, 8f, 12f, 8f)
                curveTo(16.96f, 8f, 21f, 12.04f, 21f, 17f)
                horizontalLineTo(23f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 6f)
                moveTo(12f, 10f)
                curveTo(8.14f, 10f, 5f, 13.14f, 5f, 17f)
                horizontalLineTo(7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 17f)
                horizontalLineTo(19f)
                curveTo(19f, 13.14f, 15.86f, 10f, 12f, 10f)
                close()
            }
        }.build()

        return _Looks!!
    }

@Suppress("ObjectPropertyName")
private var _Looks: ImageVector? = null
