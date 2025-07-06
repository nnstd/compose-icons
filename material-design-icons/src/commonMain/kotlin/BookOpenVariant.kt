package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookOpenVariant: ImageVector
    get() {
        if (_BookOpenVariant != null) {
            return _BookOpenVariant!!
        }
        _BookOpenVariant = ImageVector.Builder(
            name = "BookOpenVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21.5f)
                curveTo(10.65f, 20.65f, 8.2f, 20f, 6.5f, 20f)
                curveTo(4.85f, 20f, 3.15f, 20.3f, 1.75f, 21.05f)
                curveTo(1.65f, 21.1f, 1.6f, 21.1f, 1.5f, 21.1f)
                curveTo(1.25f, 21.1f, 1f, 20.85f, 1f, 20.6f)
                verticalLineTo(6f)
                curveTo(1.6f, 5.55f, 2.25f, 5.25f, 3f, 5f)
                curveTo(4.11f, 4.65f, 5.33f, 4.5f, 6.5f, 4.5f)
                curveTo(8.45f, 4.5f, 10.55f, 4.9f, 12f, 6f)
                curveTo(13.45f, 4.9f, 15.55f, 4.5f, 17.5f, 4.5f)
                curveTo(18.67f, 4.5f, 19.89f, 4.65f, 21f, 5f)
                curveTo(21.75f, 5.25f, 22.4f, 5.55f, 23f, 6f)
                verticalLineTo(20.6f)
                curveTo(23f, 20.85f, 22.75f, 21.1f, 22.5f, 21.1f)
                curveTo(22.4f, 21.1f, 22.35f, 21.1f, 22.25f, 21.05f)
                curveTo(20.85f, 20.3f, 19.15f, 20f, 17.5f, 20f)
                curveTo(15.8f, 20f, 13.35f, 20.65f, 12f, 21.5f)
                moveTo(12f, 8f)
                verticalLineTo(19.5f)
                curveTo(13.35f, 18.65f, 15.8f, 18f, 17.5f, 18f)
                curveTo(18.7f, 18f, 19.9f, 18.15f, 21f, 18.5f)
                verticalLineTo(7f)
                curveTo(19.9f, 6.65f, 18.7f, 6.5f, 17.5f, 6.5f)
                curveTo(15.8f, 6.5f, 13.35f, 7.15f, 12f, 8f)
                moveTo(13f, 11.5f)
                curveTo(14.11f, 10.82f, 15.6f, 10.5f, 17.5f, 10.5f)
                curveTo(18.41f, 10.5f, 19.26f, 10.59f, 20f, 10.78f)
                verticalLineTo(9.23f)
                curveTo(19.13f, 9.08f, 18.29f, 9f, 17.5f, 9f)
                curveTo(15.73f, 9f, 14.23f, 9.28f, 13f, 9.84f)
                verticalLineTo(11.5f)
                moveTo(17.5f, 11.67f)
                curveTo(15.79f, 11.67f, 14.29f, 11.93f, 13f, 12.46f)
                verticalLineTo(14.15f)
                curveTo(14.11f, 13.5f, 15.6f, 13.16f, 17.5f, 13.16f)
                curveTo(18.54f, 13.16f, 19.38f, 13.24f, 20f, 13.4f)
                verticalLineTo(11.9f)
                curveTo(19.13f, 11.74f, 18.29f, 11.67f, 17.5f, 11.67f)
                moveTo(20f, 14.57f)
                curveTo(19.13f, 14.41f, 18.29f, 14.33f, 17.5f, 14.33f)
                curveTo(15.67f, 14.33f, 14.17f, 14.6f, 13f, 15.13f)
                verticalLineTo(16.82f)
                curveTo(14.11f, 16.16f, 15.6f, 15.83f, 17.5f, 15.83f)
                curveTo(18.54f, 15.83f, 19.38f, 15.91f, 20f, 16.07f)
                verticalLineTo(14.57f)
                close()
            }
        }.build()

        return _BookOpenVariant!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenVariant: ImageVector? = null
