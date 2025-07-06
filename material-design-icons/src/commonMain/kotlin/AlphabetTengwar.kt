package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphabetTengwar: ImageVector
    get() {
        if (_AlphabetTengwar != null) {
            return _AlphabetTengwar!!
        }
        _AlphabetTengwar = ImageVector.Builder(
            name = "AlphabetTengwar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 7f)
                lineTo(12.5f, 3f)
                horizontalLineTo(15f)
                lineTo(11f, 7f)
                horizontalLineTo(10f)
                moveTo(12.5f, 9f)
                curveTo(11.96f, 9f, 11.46f, 9.13f, 11f, 9.35f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(12.5f)
                curveTo(11f, 11.67f, 11.67f, 11f, 12.5f, 11f)
                curveTo(13.33f, 11f, 14f, 11.67f, 14f, 12.5f)
                verticalLineTo(14.5f)
                curveTo(14f, 15.33f, 13.33f, 16f, 12.5f, 16f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(12.5f)
                curveTo(14.43f, 18f, 16f, 16.43f, 16f, 14.5f)
                verticalLineTo(12.5f)
                curveTo(16f, 10.57f, 14.43f, 9f, 12.5f, 9f)
                close()
            }
        }.build()

        return _AlphabetTengwar!!
    }

@Suppress("ObjectPropertyName")
private var _AlphabetTengwar: ImageVector? = null
