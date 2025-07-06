package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleSodaClassicOutline: ImageVector
    get() {
        if (_BottleSodaClassicOutline != null) {
            return _BottleSodaClassicOutline!!
        }
        _BottleSodaClassicOutline = ImageVector.Builder(
            name = "BottleSodaClassicOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                verticalLineTo(4f)
                horizontalLineTo(10.91f)
                curveTo(10.65f, 5.79f, 9f, 7.5f, 8f, 9f)
                verticalLineTo(13.77f)
                curveTo(9.32f, 14.96f, 9.32f, 17.04f, 8f, 18.23f)
                verticalLineTo(20f)
                curveTo(8f, 21.11f, 8.9f, 22f, 10f, 22f)
                horizontalLineTo(14f)
                curveTo(15.11f, 22f, 16f, 21.11f, 16f, 20f)
                verticalLineTo(18.23f)
                curveTo(14.68f, 17.04f, 14.68f, 14.96f, 16f, 13.77f)
                verticalLineTo(9f)
                curveTo(15f, 7.5f, 13.35f, 5.79f, 13.09f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                moveTo(12f, 6.5f)
                curveTo(12.24f, 7f, 13.54f, 8.5f, 13.9f, 8.91f)
                lineTo(14f, 9f)
                verticalLineTo(13f)
                curveTo(13.35f, 13.87f, 13f, 14.92f, 13f, 16f)
                curveTo(13f, 17.08f, 13.35f, 18.13f, 14f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                curveTo(10.65f, 18.13f, 11f, 17.08f, 11f, 16f)
                curveTo(11f, 14.92f, 10.65f, 13.87f, 10f, 13f)
                verticalLineTo(9f)
                lineTo(10.1f, 8.91f)
                curveTo(10.46f, 8.5f, 11.76f, 7f, 12f, 6.5f)
                close()
            }
        }.build()

        return _BottleSodaClassicOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BottleSodaClassicOutline: ImageVector? = null
