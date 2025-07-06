package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoSwitch: ImageVector
    get() {
        if (_VideoSwitch != null) {
            return _VideoSwitch!!
        }
        _VideoSwitch = ImageVector.Builder(
            name = "VideoSwitch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15.5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(15.5f)
                lineTo(3.5f, 12f)
                lineTo(7f, 8.5f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(8.5f)
                lineTo(16.5f, 12f)
                moveTo(18f, 9.5f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 5f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 19f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
                verticalLineTo(14.5f)
                lineTo(22f, 18.5f)
                verticalLineTo(5.5f)
                lineTo(18f, 9.5f)
                close()
            }
        }.build()

        return _VideoSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _VideoSwitch: ImageVector? = null
