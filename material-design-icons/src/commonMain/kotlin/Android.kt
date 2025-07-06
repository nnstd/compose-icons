package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Android: ImageVector
    get() {
        if (_Android != null) {
            return _Android!!
        }
        _Android = ImageVector.Builder(
            name = "Android",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.61f, 15.15f)
                curveTo(16.15f, 15.15f, 15.77f, 14.78f, 15.77f, 14.32f)
                reflectiveCurveTo(16.15f, 13.5f, 16.61f, 13.5f)
                horizontalLineTo(16.61f)
                curveTo(17.07f, 13.5f, 17.45f, 13.86f, 17.45f, 14.32f)
                curveTo(17.45f, 14.78f, 17.07f, 15.15f, 16.61f, 15.15f)
                moveTo(7.41f, 15.15f)
                curveTo(6.95f, 15.15f, 6.57f, 14.78f, 6.57f, 14.32f)
                curveTo(6.57f, 13.86f, 6.95f, 13.5f, 7.41f, 13.5f)
                horizontalLineTo(7.41f)
                curveTo(7.87f, 13.5f, 8.24f, 13.86f, 8.24f, 14.32f)
                curveTo(8.24f, 14.78f, 7.87f, 15.15f, 7.41f, 15.15f)
                moveTo(16.91f, 10.14f)
                lineTo(18.58f, 7.26f)
                curveTo(18.67f, 7.09f, 18.61f, 6.88f, 18.45f, 6.79f)
                curveTo(18.28f, 6.69f, 18.07f, 6.75f, 18f, 6.92f)
                lineTo(16.29f, 9.83f)
                curveTo(14.95f, 9.22f, 13.5f, 8.9f, 12f, 8.91f)
                curveTo(10.47f, 8.91f, 9f, 9.24f, 7.73f, 9.82f)
                lineTo(6.04f, 6.91f)
                curveTo(5.95f, 6.74f, 5.74f, 6.68f, 5.57f, 6.78f)
                curveTo(5.4f, 6.87f, 5.35f, 7.08f, 5.44f, 7.25f)
                lineTo(7.1f, 10.13f)
                curveTo(4.25f, 11.69f, 2.29f, 14.58f, 2f, 18f)
                horizontalLineTo(22f)
                curveTo(21.72f, 14.59f, 19.77f, 11.7f, 16.91f, 10.14f)
                horizontalLineTo(16.91f)
                close()
            }
        }.build()

        return _Android!!
    }

@Suppress("ObjectPropertyName")
private var _Android: ImageVector? = null
