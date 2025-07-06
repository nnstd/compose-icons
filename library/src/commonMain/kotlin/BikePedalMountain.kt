package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BikePedalMountain: ImageVector
    get() {
        if (_BikePedalMountain != null) {
            return _BikePedalMountain!!
        }
        _BikePedalMountain = ImageVector.Builder(
            name = "BikePedalMountain",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.82f, 5f)
                curveTo(5.87f, 5f, 5.05f, 5.67f, 4.86f, 6.61f)
                lineTo(4.04f, 10.71f)
                curveTo(4f, 10.84f, 4f, 10.97f, 4f, 11.1f)
                verticalLineTo(12.9f)
                curveTo(4f, 13.03f, 4f, 13.16f, 4.04f, 13.29f)
                lineTo(4.86f, 17.39f)
                curveTo(5.05f, 18.33f, 5.87f, 19f, 6.82f, 19f)
                horizontalLineTo(13.38f)
                curveTo(14.14f, 19f, 14.83f, 18.57f, 15.17f, 17.89f)
                lineTo(16.79f, 14.66f)
                curveTo(16.89f, 14.45f, 16.96f, 14.23f, 17f, 14f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                curveTo(16.96f, 9.77f, 16.89f, 9.55f, 16.79f, 9.34f)
                lineTo(15.17f, 6.11f)
                curveTo(14.83f, 5.43f, 14.14f, 5f, 13.38f, 5f)
                horizontalLineTo(6.82f)
                moveTo(6.82f, 7f)
                horizontalLineTo(7.38f)
                lineTo(9.88f, 12f)
                lineTo(7.38f, 17f)
                horizontalLineTo(6.82f)
                lineTo(6f, 12.9f)
                verticalLineTo(11.1f)
                lineTo(6.82f, 7f)
                moveTo(11.62f, 11f)
                lineTo(9.62f, 7f)
                horizontalLineTo(13.38f)
                lineTo(15f, 10.24f)
                verticalLineTo(11f)
                horizontalLineTo(11.62f)
                moveTo(11.62f, 13f)
                horizontalLineTo(15f)
                verticalLineTo(13.76f)
                lineTo(13.38f, 17f)
                horizontalLineTo(9.62f)
                lineTo(11.62f, 13f)
                close()
            }
        }.build()

        return _BikePedalMountain!!
    }

@Suppress("ObjectPropertyName")
private var _BikePedalMountain: ImageVector? = null
