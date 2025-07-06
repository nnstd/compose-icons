package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GiftOpen: ImageVector
    get() {
        if (_GiftOpen != null) {
            return _GiftOpen!!
        }
        _GiftOpen = ImageVector.Builder(
            name = "GiftOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 10.92f)
                lineTo(19.26f, 9.33f)
                curveTo(21.9f, 7.08f, 19.25f, 2.88f, 16.08f, 4.31f)
                lineTo(15.21f, 4.68f)
                lineTo(15.1f, 3.72f)
                curveTo(15f, 2.64f, 14.44f, 1.87f, 13.7f, 1.42f)
                curveTo(12.06f, 0.467f, 9.56f, 1.12f, 9.16f, 3.5f)
                lineTo(6.41f, 1.92f)
                curveTo(5.45f, 1.36f, 4.23f, 1.69f, 3.68f, 2.65f)
                lineTo(2.68f, 4.38f)
                curveTo(2.4f, 4.86f, 2.57f, 5.47f, 3.05f, 5.75f)
                lineTo(10.84f, 10.25f)
                lineTo(12.34f, 7.65f)
                lineTo(14.07f, 8.65f)
                lineTo(12.57f, 11.25f)
                lineTo(20.36f, 15.75f)
                curveTo(20.84f, 16f, 21.46f, 15.86f, 21.73f, 15.38f)
                lineTo(22.73f, 13.65f)
                curveTo(23.28f, 12.69f, 22.96f, 11.47f, 22f, 10.92f)
                moveTo(12.37f, 5f)
                curveTo(11.5f, 5.25f, 10.8f, 4.32f, 11.24f, 3.55f)
                curveTo(11.5f, 3.07f, 12.13f, 2.91f, 12.61f, 3.18f)
                curveTo(13.38f, 3.63f, 13.23f, 4.79f, 12.37f, 5f)
                moveTo(17.56f, 8f)
                curveTo(16.7f, 8.25f, 16f, 7.32f, 16.44f, 6.55f)
                curveTo(16.71f, 6.07f, 17.33f, 5.91f, 17.8f, 6.18f)
                curveTo(18.57f, 6.63f, 18.42f, 7.79f, 17.56f, 8f)
                moveTo(20.87f, 16.88f)
                curveTo(21.28f, 16.88f, 21.67f, 16.74f, 22f, 16.5f)
                verticalLineTo(20f)
                curveTo(22f, 21.11f, 21.11f, 22f, 20f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.11f, 2f, 20f)
                verticalLineTo(11f)
                horizontalLineTo(10.15f)
                lineTo(11f, 11.5f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(12.65f)
                lineTo(19.87f, 16.61f)
                curveTo(20.17f, 16.79f, 20.5f, 16.88f, 20.87f, 16.88f)
                close()
            }
        }.build()

        return _GiftOpen!!
    }

@Suppress("ObjectPropertyName")
private var _GiftOpen: ImageVector? = null
