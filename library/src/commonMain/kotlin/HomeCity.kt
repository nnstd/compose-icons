package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeCity: ImageVector
    get() {
        if (_HomeCity != null) {
            return _HomeCity!!
        }
        _HomeCity = ImageVector.Builder(
            name = "HomeCity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                verticalLineTo(10f)
                lineTo(7.5f, 5f)
                lineTo(15f, 10f)
                verticalLineTo(21f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(5f)
                verticalLineTo(21f)
                horizontalLineTo(0f)
                moveTo(24f, 2f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(8.93f)
                lineTo(16f, 8.27f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(6.93f)
                lineTo(10f, 4.27f)
                verticalLineTo(2f)
                horizontalLineTo(24f)
                moveTo(21f, 14f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                moveTo(21f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                moveTo(21f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _HomeCity!!
    }

@Suppress("ObjectPropertyName")
private var _HomeCity: ImageVector? = null
