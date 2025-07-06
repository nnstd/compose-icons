package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cordova: ImageVector
    get() {
        if (_Cordova != null) {
            return _Cordova!!
        }
        _Cordova = ImageVector.Builder(
            name = "Cordova",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.18f, 21.55f)
                horizontalLineTo(16.94f)
                lineTo(17.17f, 18.82f)
                horizontalLineTo(15.58f)
                lineTo(15.35f, 21.55f)
                horizontalLineTo(8.65f)
                lineTo(8.42f, 18.82f)
                horizontalLineTo(6.83f)
                lineTo(7.06f, 21.55f)
                horizontalLineTo(3.82f)
                lineTo(2f, 9.73f)
                lineTo(6.55f, 2.45f)
                horizontalLineTo(17.45f)
                lineTo(22f, 9.73f)
                lineTo(20.18f, 21.55f)
                moveTo(16.55f, 6.09f)
                horizontalLineTo(13.62f)
                lineTo(13.82f, 7.45f)
                horizontalLineTo(10.18f)
                lineTo(10.38f, 6.09f)
                horizontalLineTo(7.45f)
                lineTo(5.64f, 9.73f)
                lineTo(6.55f, 17f)
                horizontalLineTo(17.45f)
                lineTo(18.36f, 9.73f)
                lineTo(16.55f, 6.09f)
                moveTo(14.95f, 14.59f)
                curveTo(14.7f, 14.59f, 14.5f, 13.83f, 14.5f, 12.9f)
                curveTo(14.5f, 11.96f, 14.7f, 11.2f, 14.95f, 11.2f)
                curveTo(15.21f, 11.2f, 15.41f, 11.96f, 15.41f, 12.9f)
                curveTo(15.41f, 13.83f, 15.21f, 14.59f, 14.95f, 14.59f)
                moveTo(9.22f, 14.73f)
                curveTo(8.96f, 14.73f, 8.76f, 13.97f, 8.76f, 13.04f)
                curveTo(8.76f, 12.1f, 8.96f, 11.35f, 9.22f, 11.35f)
                curveTo(9.47f, 11.35f, 9.67f, 12.1f, 9.67f, 13.04f)
                curveTo(9.67f, 13.97f, 9.47f, 14.73f, 9.22f, 14.73f)
                close()
            }
        }.build()

        return _Cordova!!
    }

@Suppress("ObjectPropertyName")
private var _Cordova: ImageVector? = null
