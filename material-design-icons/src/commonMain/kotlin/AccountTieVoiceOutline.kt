package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountTieVoiceOutline: ImageVector
    get() {
        if (_AccountTieVoiceOutline != null) {
            return _AccountTieVoiceOutline!!
        }
        _AccountTieVoiceOutline = ImageVector.Builder(
            name = "AccountTieVoiceOutline",
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
                moveTo(13.36f, 13.76f)
                curveTo(15.31f, 14.42f, 17f, 15.5f, 17f, 17f)
                verticalLineTo(22f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                curveTo(1f, 15.5f, 2.69f, 14.42f, 4.65f, 13.76f)
                lineTo(5.27f, 15f)
                lineTo(5.5f, 15.5f)
                curveTo(4f, 15.96f, 2.9f, 16.62f, 2.9f, 17f)
                verticalLineTo(20.1f)
                horizontalLineTo(7.12f)
                lineTo(8f, 15.03f)
                lineTo(7.06f, 13.15f)
                curveTo(7.68f, 13.08f, 8.33f, 13.03f, 9f, 13.03f)
                reflectiveCurveTo(10.32f, 13.08f, 10.94f, 13.15f)
                lineTo(10f, 15.03f)
                lineTo(10.88f, 20.1f)
                horizontalLineTo(15.1f)
                verticalLineTo(17f)
                curveTo(15.1f, 16.62f, 14f, 15.96f, 12.5f, 15.5f)
                lineTo(12.73f, 15f)
                lineTo(13.36f, 13.76f)
                moveTo(9f, 6f)
                curveTo(7.9f, 6f, 7f, 6.9f, 7f, 8f)
                reflectiveCurveTo(7.9f, 10f, 9f, 10f)
                reflectiveCurveTo(11f, 9.1f, 11f, 8f)
                reflectiveCurveTo(10.1f, 6f, 9f, 6f)
                moveTo(9f, 12f)
                curveTo(6.79f, 12f, 5f, 10.21f, 5f, 8f)
                reflectiveCurveTo(6.79f, 4f, 9f, 4f)
                reflectiveCurveTo(13f, 5.79f, 13f, 8f)
                reflectiveCurveTo(11.21f, 12f, 9f, 12f)
                close()
            }
        }.build()

        return _AccountTieVoiceOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountTieVoiceOutline: ImageVector? = null
