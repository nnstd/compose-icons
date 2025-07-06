package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CastAudioVariant: ImageVector
    get() {
        if (_CastAudioVariant != null) {
            return _CastAudioVariant!!
        }
        _CastAudioVariant = ImageVector.Builder(
            name = "CastAudioVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 12f)
                curveTo(14.5f, 10.62f, 13.38f, 9.5f, 12f, 9.5f)
                curveTo(10.62f, 9.5f, 9.5f, 10.62f, 9.5f, 12f)
                curveTo(9.5f, 13f, 10.09f, 13.84f, 10.93f, 14.25f)
                lineTo(9.82f, 15.35f)
                curveTo(8.73f, 14.64f, 8f, 13.41f, 8f, 12f)
                curveTo(8f, 9.79f, 9.79f, 8f, 12f, 8f)
                curveTo(14.21f, 8f, 16f, 9.79f, 16f, 12f)
                curveTo(16f, 13.41f, 15.27f, 14.64f, 14.18f, 15.35f)
                lineTo(13.08f, 14.25f)
                curveTo(13.92f, 13.84f, 14.5f, 13f, 14.5f, 12f)
                moveTo(12f, 2f)
                curveTo(6.5f, 2f, 2f, 6.5f, 2f, 12f)
                curveTo(2f, 15.06f, 3.38f, 17.8f, 5.54f, 19.63f)
                lineTo(6.61f, 18.57f)
                curveTo(4.71f, 17f, 3.5f, 14.64f, 3.5f, 12f)
                curveTo(3.5f, 7.31f, 7.31f, 3.5f, 12f, 3.5f)
                curveTo(16.69f, 3.5f, 20.5f, 7.31f, 20.5f, 12f)
                curveTo(20.5f, 14.64f, 19.29f, 17f, 17.39f, 18.57f)
                lineTo(18.46f, 19.63f)
                curveTo(20.62f, 17.79f, 22f, 15.06f, 22f, 12f)
                curveTo(22f, 6.5f, 17.5f, 2f, 12f, 2f)
                moveTo(19f, 12f)
                curveTo(19f, 8.13f, 15.87f, 5f, 12f, 5f)
                curveTo(8.13f, 5f, 5f, 8.13f, 5f, 12f)
                curveTo(5f, 14.23f, 6.05f, 16.22f, 7.68f, 17.5f)
                lineTo(8.75f, 16.43f)
                curveTo(7.39f, 15.42f, 6.5f, 13.82f, 6.5f, 12f)
                curveTo(6.5f, 8.97f, 8.97f, 6.5f, 12f, 6.5f)
                curveTo(15.03f, 6.5f, 17.5f, 8.97f, 17.5f, 12f)
                curveTo(17.5f, 13.82f, 16.61f, 15.42f, 15.25f, 16.43f)
                lineTo(16.33f, 17.5f)
                curveTo(17.95f, 16.22f, 19f, 14.23f, 19f, 12f)
                moveTo(6f, 22f)
                horizontalLineTo(18f)
                lineTo(12f, 16f)
                lineTo(6f, 22f)
                close()
            }
        }.build()

        return _CastAudioVariant!!
    }

@Suppress("ObjectPropertyName")
private var _CastAudioVariant: ImageVector? = null
