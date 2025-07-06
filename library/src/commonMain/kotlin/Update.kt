package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Update: ImageVector
    get() {
        if (_Update != null) {
            return _Update!!
        }
        _Update = ImageVector.Builder(
            name = "Update",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 10.12f)
                horizontalLineTo(14.22f)
                lineTo(16.96f, 7.3f)
                curveTo(14.23f, 4.6f, 9.81f, 4.5f, 7.08f, 7.2f)
                curveTo(4.35f, 9.91f, 4.35f, 14.28f, 7.08f, 17f)
                curveTo(9.81f, 19.7f, 14.23f, 19.7f, 16.96f, 17f)
                curveTo(18.32f, 15.65f, 19f, 14.08f, 19f, 12.1f)
                horizontalLineTo(21f)
                curveTo(21f, 14.08f, 20.12f, 16.65f, 18.36f, 18.39f)
                curveTo(14.85f, 21.87f, 9.15f, 21.87f, 5.64f, 18.39f)
                curveTo(2.14f, 14.92f, 2.11f, 9.28f, 5.62f, 5.81f)
                curveTo(9.13f, 2.34f, 14.76f, 2.34f, 18.27f, 5.81f)
                lineTo(21f, 3f)
                verticalLineTo(10.12f)
                moveTo(12.5f, 8f)
                verticalLineTo(12.25f)
                lineTo(16f, 14.33f)
                lineTo(15.28f, 15.54f)
                lineTo(11f, 13f)
                verticalLineTo(8f)
                horizontalLineTo(12.5f)
                close()
            }
        }.build()

        return _Update!!
    }

@Suppress("ObjectPropertyName")
private var _Update: ImageVector? = null
