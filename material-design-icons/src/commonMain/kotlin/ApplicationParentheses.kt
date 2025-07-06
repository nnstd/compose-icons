package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationParentheses: ImageVector
    get() {
        if (_ApplicationParentheses != null) {
            return _ApplicationParentheses!!
        }
        _ApplicationParentheses = ImageVector.Builder(
            name = "ApplicationParentheses",
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
                moveTo(10f, 19.4f)
                lineTo(8.4f, 20f)
                curveTo(6.9f, 18.6f, 6f, 16.6f, 6f, 14.5f)
                reflectiveCurveTo(6.9f, 10.4f, 8.4f, 9f)
                lineTo(10f, 9.6f)
                curveTo(8.7f, 10.7f, 8f, 12.6f, 8f, 14.5f)
                reflectiveCurveTo(8.7f, 18.2f, 10f, 19.4f)
                moveTo(15.6f, 20f)
                lineTo(14f, 19.4f)
                curveTo(15.3f, 18.2f, 16f, 16.4f, 16f, 14.5f)
                reflectiveCurveTo(15.3f, 10.8f, 14f, 9.6f)
                lineTo(15.6f, 9f)
                curveTo(17.1f, 10.4f, 18f, 12.4f, 18f, 14.5f)
                curveTo(18f, 16.6f, 17.1f, 18.6f, 15.6f, 20f)
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ApplicationParentheses!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationParentheses: ImageVector? = null
