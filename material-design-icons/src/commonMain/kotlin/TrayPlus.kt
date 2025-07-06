package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrayPlus: ImageVector
    get() {
        if (_TrayPlus != null) {
            return _TrayPlus!!
        }
        _TrayPlus = ImageVector.Builder(
            name = "TrayPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17f)
                moveTo(11f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _TrayPlus!!
    }

@Suppress("ObjectPropertyName")
private var _TrayPlus: ImageVector? = null
