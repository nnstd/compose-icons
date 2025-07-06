package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTieVoice: ImageVector
    get() {
        if (_AccountTieVoice != null) {
            return _AccountTieVoice!!
        }
        _AccountTieVoice = ImageVector.Builder(
            name = "AccountTieVoice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.75f, 4.36f)
                curveTo(18.77f, 6.56f, 18.77f, 9.61f, 16.75f, 11.63f)
                lineTo(15.07f, 9.94f)
                curveTo(15.91f, 8.76f, 15.91f, 7.23f, 15.07f, 6.05f)
                lineTo(16.75f, 4.36f)
                moveTo(20.06f, 1f)
                curveTo(24f, 5.05f, 23.96f, 11.11f, 20.06f, 15f)
                lineTo(18.43f, 13.37f)
                curveTo(21.2f, 10.19f, 21.2f, 5.65f, 18.43f, 2.63f)
                lineTo(20.06f, 1f)
                moveTo(9f, 4f)
                curveTo(11.2f, 4f, 13f, 5.79f, 13f, 8f)
                reflectiveCurveTo(11.2f, 12f, 9f, 12f)
                reflectiveCurveTo(5f, 10.21f, 5f, 8f)
                reflectiveCurveTo(6.79f, 4f, 9f, 4f)
                moveTo(13f, 14.54f)
                curveTo(13f, 15.6f, 12.71f, 18.07f, 10.8f, 20.83f)
                lineTo(10f, 16f)
                lineTo(10.93f, 14.12f)
                curveTo(10.31f, 14.05f, 9.66f, 14f, 9f, 14f)
                reflectiveCurveTo(7.67f, 14.05f, 7.05f, 14.12f)
                lineTo(8f, 16f)
                lineTo(7.18f, 20.83f)
                curveTo(5.27f, 18.07f, 5f, 15.6f, 5f, 14.54f)
                curveTo(2.6f, 15.24f, 0.994f, 16.5f, 0.994f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                curveTo(17f, 16.5f, 15.39f, 15.24f, 13f, 14.54f)
                close()
            }
        }.build()

        return _AccountTieVoice!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTieVoice: ImageVector? = null
