package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Drupal: ImageVector
    get() {
        if (_Drupal != null) {
            return _Drupal!!
        }
        _Drupal = ImageVector.Builder(
            name = "Drupal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.47f, 14.65f)
                curveTo(20.47f, 15.29f, 20.25f, 16.36f, 19.83f, 17.1f)
                curveTo(19.4f, 17.85f, 19.08f, 18.06f, 18.44f, 18.06f)
                curveTo(17.7f, 17.95f, 16.31f, 15.82f, 15.36f, 15.72f)
                curveTo(14.18f, 15.72f, 11.73f, 18.17f, 9.71f, 18.17f)
                curveTo(8.54f, 18.17f, 8.11f, 17.95f, 7.79f, 17.74f)
                curveTo(7.15f, 17.31f, 6.94f, 16.67f, 6.94f, 15.82f)
                curveTo(6.94f, 14.22f, 8.43f, 12.84f, 10.24f, 12.84f)
                curveTo(12.59f, 12.84f, 14.18f, 15.18f, 15.36f, 15.08f)
                curveTo(16.31f, 15.08f, 18.23f, 13.16f, 19.19f, 13.16f)
                curveTo(20.15f, 12.95f, 20.47f, 14f, 20.47f, 14.65f)
                moveTo(16.63f, 5.28f)
                curveTo(15.57f, 4.64f, 14.61f, 4.32f, 13.54f, 3.68f)
                curveTo(12.91f, 3.25f, 12.05f, 2.3f, 11.31f, 1.44f)
                curveTo(11f, 2.83f, 10.78f, 3.36f, 10.24f, 3.79f)
                curveTo(9.18f, 4.53f, 8.64f, 4.85f, 7.69f, 5.28f)
                curveTo(6.94f, 5.7f, 3f, 8.05f, 3f, 13.16f)
                curveTo(3f, 18.27f, 7.37f, 22f, 12.05f, 22f)
                curveTo(16.85f, 22f, 21f, 18.5f, 21f, 13.27f)
                curveTo(21.21f, 8.05f, 17.27f, 5.7f, 16.63f, 5.28f)
                close()
            }
        }.build()

        return _Drupal!!
    }

@Suppress("ObjectPropertyName")
private var _Drupal: ImageVector? = null
