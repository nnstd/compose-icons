package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LogoutVariant: ImageVector
    get() {
        if (_LogoutVariant != null) {
            return _LogoutVariant!!
        }
        _LogoutVariant = ImageVector.Builder(
            name = "LogoutVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.08f, 15.59f)
                lineTo(16.67f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(16.67f)
                lineTo(14.08f, 8.41f)
                lineTo(15.5f, 7f)
                lineTo(20.5f, 12f)
                lineTo(15.5f, 17f)
                lineTo(14.08f, 15.59f)
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(9.67f)
                lineTo(19f, 7.67f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(16.33f)
                lineTo(21f, 14.33f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _LogoutVariant!!
    }

@Suppress("ObjectPropertyName")
private var _LogoutVariant: ImageVector? = null
