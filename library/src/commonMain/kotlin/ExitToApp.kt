package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ExitToApp: ImageVector
    get() {
        if (_ExitToApp != null) {
            return _ExitToApp!!
        }
        _ExitToApp = ImageVector.Builder(
            name = "ExitToApp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                moveTo(10.08f, 15.58f)
                lineTo(11.5f, 17f)
                lineTo(16.5f, 12f)
                lineTo(11.5f, 7f)
                lineTo(10.08f, 8.41f)
                lineTo(12.67f, 11f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(12.67f)
                lineTo(10.08f, 15.58f)
                close()
            }
        }.build()

        return _ExitToApp!!
    }

@Suppress("ObjectPropertyName")
private var _ExitToApp: ImageVector? = null
