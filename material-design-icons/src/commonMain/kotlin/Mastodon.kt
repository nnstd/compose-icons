package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Mastodon: ImageVector
    get() {
        if (_Mastodon != null) {
            return _Mastodon!!
        }
        _Mastodon = ImageVector.Builder(
            name = "Mastodon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 14f)
                curveTo(20.66f, 15.41f, 18.5f, 16.96f, 15.97f, 17.26f)
                curveTo(14.66f, 17.41f, 13.37f, 17.56f, 12f, 17.5f)
                curveTo(9.75f, 17.39f, 8f, 16.96f, 8f, 16.96f)
                verticalLineTo(17.58f)
                curveTo(8.32f, 19.8f, 10.22f, 19.93f, 12.03f, 20f)
                curveTo(13.85f, 20.05f, 15.47f, 19.54f, 15.47f, 19.54f)
                lineTo(15.55f, 21.19f)
                curveTo(15.55f, 21.19f, 14.27f, 21.87f, 12f, 22f)
                curveTo(10.75f, 22.07f, 9.19f, 21.97f, 7.38f, 21.5f)
                curveTo(3.46f, 20.45f, 2.78f, 16.26f, 2.68f, 12f)
                lineTo(2.67f, 8.57f)
                curveTo(2.67f, 4.23f, 5.5f, 2.96f, 5.5f, 2.96f)
                curveTo(6.95f, 2.3f, 9.41f, 2f, 11.97f, 2f)
                horizontalLineTo(12.03f)
                curveTo(14.59f, 2f, 17.05f, 2.3f, 18.5f, 2.96f)
                curveTo(18.5f, 2.96f, 21.33f, 4.23f, 21.33f, 8.57f)
                curveTo(21.33f, 8.57f, 21.37f, 11.78f, 20.94f, 14f)
                moveTo(18f, 8.91f)
                curveTo(18f, 7.83f, 17.7f, 7f, 17.15f, 6.35f)
                curveTo(16.59f, 5.72f, 15.85f, 5.39f, 14.92f, 5.39f)
                curveTo(13.86f, 5.39f, 13.05f, 5.8f, 12.5f, 6.62f)
                lineTo(12f, 7.5f)
                lineTo(11.5f, 6.62f)
                curveTo(10.94f, 5.8f, 10.14f, 5.39f, 9.07f, 5.39f)
                curveTo(8.15f, 5.39f, 7.41f, 5.72f, 6.84f, 6.35f)
                curveTo(6.29f, 7f, 6f, 7.83f, 6f, 8.91f)
                verticalLineTo(14.17f)
                horizontalLineTo(8.1f)
                verticalLineTo(9.06f)
                curveTo(8.1f, 8f, 8.55f, 7.44f, 9.46f, 7.44f)
                curveTo(10.46f, 7.44f, 10.96f, 8.09f, 10.96f, 9.37f)
                verticalLineTo(12.16f)
                horizontalLineTo(13.03f)
                verticalLineTo(9.37f)
                curveTo(13.03f, 8.09f, 13.53f, 7.44f, 14.54f, 7.44f)
                curveTo(15.44f, 7.44f, 15.89f, 8f, 15.89f, 9.06f)
                verticalLineTo(14.17f)
                horizontalLineTo(18f)
                verticalLineTo(8.91f)
                close()
            }
        }.build()

        return _Mastodon!!
    }

@Suppress("ObjectPropertyName")
private var _Mastodon: ImageVector? = null
