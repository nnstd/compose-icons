package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountNetworkOffOutline: ImageVector
    get() {
        if (_AccountNetworkOffOutline != null) {
            return _AccountNetworkOffOutline!!
        }
        _AccountNetworkOffOutline = ImageVector.Builder(
            name = "AccountNetworkOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15.8f)
                lineTo(15.75f, 12.55f)
                curveTo(17.7f, 13.17f, 19f, 14.26f, 19f, 15.5f)
                verticalLineTo(15.8f)
                moveTo(13.03f, 9.83f)
                lineTo(8.67f, 5.47f)
                curveTo(9.11f, 4.04f, 10.43f, 3f, 12f, 3f)
                curveTo(13.93f, 3f, 15.5f, 4.57f, 15.5f, 6.5f)
                curveTo(15.5f, 8.07f, 14.46f, 9.39f, 13.03f, 9.83f)
                moveTo(12f, 8f)
                curveTo(12.83f, 8f, 13.5f, 7.33f, 13.5f, 6.5f)
                reflectiveCurveTo(12.83f, 5f, 12f, 5f)
                reflectiveCurveTo(10.5f, 5.67f, 10.5f, 6.5f)
                reflectiveCurveTo(11.17f, 8f, 12f, 8f)
                moveTo(22f, 22f)
                horizontalLineTo(21.57f)
                lineTo(20.84f, 22.73f)
                lineTo(20.11f, 22f)
                horizontalLineTo(15f)
                curveTo(15f, 22.55f, 14.55f, 23f, 14f, 23f)
                horizontalLineTo(10f)
                curveTo(9.45f, 23f, 9f, 22.55f, 9f, 22f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                curveTo(9f, 19.45f, 9.45f, 19f, 10f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(15.5f)
                curveTo(5f, 13.88f, 7.22f, 12.5f, 10.23f, 12.12f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22f, 21.34f)
                verticalLineTo(21.35f)
                lineTo(22.11f, 21.46f)
                lineTo(22f, 21.57f)
                verticalLineTo(22f)
                moveTo(13.11f, 15f)
                lineTo(12.11f, 14f)
                curveTo(12.08f, 14f, 12.04f, 14f, 12f, 14f)
                curveTo(9.89f, 14f, 8.39f, 14.53f, 7.61f, 15f)
                horizontalLineTo(13.11f)
                moveTo(18.11f, 20f)
                lineTo(15.11f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                curveTo(14.55f, 19f, 15f, 19.45f, 15f, 20f)
                horizontalLineTo(18.11f)
                close()
            }
        }.build()

        return _AccountNetworkOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountNetworkOffOutline: ImageVector? = null
