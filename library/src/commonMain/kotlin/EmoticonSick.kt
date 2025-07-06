package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EmoticonSick: ImageVector
    get() {
        if (_EmoticonSick != null) {
            return _EmoticonSick!!
        }
        _EmoticonSick = ImageVector.Builder(
            name = "EmoticonSick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 9f)
                curveTo(19.9f, 9f, 19f, 8.1f, 19f, 7f)
                reflectiveCurveTo(21f, 3f, 21f, 3f)
                reflectiveCurveTo(23f, 5.9f, 23f, 7f)
                reflectiveCurveTo(22.1f, 9f, 21f, 9f)
                moveTo(17.5f, 7f)
                curveTo(17.5f, 6.27f, 17.91f, 5.29f, 18.42f, 4.34f)
                curveTo(16.68f, 2.88f, 14.44f, 2f, 12f, 2f)
                curveTo(6.47f, 2f, 2f, 6.5f, 2f, 12f)
                reflectiveCurveTo(6.47f, 22f, 12f, 22f)
                curveTo(17.5f, 22f, 22f, 17.5f, 22f, 12f)
                curveTo(22f, 11.45f, 21.94f, 10.91f, 21.86f, 10.38f)
                curveTo(21.58f, 10.45f, 21.3f, 10.5f, 21f, 10.5f)
                curveTo(19.07f, 10.5f, 17.5f, 8.93f, 17.5f, 7f)
                moveTo(15.62f, 7.38f)
                lineTo(16.68f, 8.44f)
                lineTo(15.62f, 9.5f)
                lineTo(16.68f, 10.56f)
                lineTo(15.62f, 11.62f)
                lineTo(13.5f, 9.5f)
                lineTo(15.62f, 7.38f)
                moveTo(7.32f, 8.44f)
                lineTo(8.38f, 7.38f)
                lineTo(10.5f, 9.5f)
                lineTo(8.38f, 11.62f)
                lineTo(7.32f, 10.56f)
                lineTo(8.38f, 9.5f)
                lineTo(7.32f, 8.44f)
                moveTo(15.44f, 17f)
                curveTo(14.75f, 15.81f, 13.47f, 15f, 12f, 15f)
                reflectiveCurveTo(9.25f, 15.81f, 8.56f, 17f)
                horizontalLineTo(6.88f)
                curveTo(7.18f, 16.24f, 7.64f, 15.57f, 8.22f, 15f)
                lineTo(5.24f, 13.3f)
                curveTo(4.79f, 13.56f, 4.23f, 13.58f, 3.75f, 13.3f)
                curveTo(3.03f, 12.89f, 2.79f, 11.97f, 3.2f, 11.25f)
                reflectiveCurveTo(4.53f, 10.29f, 5.25f, 10.7f)
                curveTo(5.73f, 11f, 6f, 11.5f, 6f, 12f)
                lineTo(9.57f, 14.06f)
                curveTo(10.3f, 13.7f, 11.12f, 13.5f, 12f, 13.5f)
                curveTo(14.33f, 13.5f, 16.32f, 14.95f, 17.12f, 17f)
                horizontalLineTo(15.44f)
                close()
            }
        }.build()

        return _EmoticonSick!!
    }

@Suppress("ObjectPropertyName")
private var _EmoticonSick: ImageVector? = null
