package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationParenthesesOutline: ImageVector
    get() {
        if (_ApplicationParenthesesOutline != null) {
            return _ApplicationParenthesesOutline!!
        }
        _ApplicationParenthesesOutline = ImageVector.Builder(
            name = "ApplicationParenthesesOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(21f)
                curveTo(22.1f, 22f, 23f, 21.1f, 23f, 20f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                moveTo(21f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                moveTo(15.6f, 8f)
                curveTo(17.1f, 9.3f, 18f, 11.1f, 18f, 13f)
                curveTo(18f, 14.9f, 17.1f, 16.7f, 15.6f, 18f)
                lineTo(14f, 17.4f)
                curveTo(15.3f, 16.4f, 16f, 14.7f, 16f, 13f)
                reflectiveCurveTo(15.3f, 9.6f, 14f, 8.6f)
                lineTo(15.6f, 8f)
                moveTo(8.4f, 8f)
                lineTo(10f, 8.6f)
                curveTo(8.7f, 9.6f, 8f, 11.3f, 8f, 13f)
                reflectiveCurveTo(8.7f, 16.4f, 10f, 17.4f)
                lineTo(8.4f, 18f)
                curveTo(6.9f, 16.7f, 6f, 14.9f, 6f, 13f)
                reflectiveCurveTo(6.9f, 9.3f, 8.4f, 8f)
                close()
            }
        }.build()

        return _ApplicationParenthesesOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationParenthesesOutline: ImageVector? = null
