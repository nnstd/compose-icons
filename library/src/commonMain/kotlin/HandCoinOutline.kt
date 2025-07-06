package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandCoinOutline: ImageVector
    get() {
        if (_HandCoinOutline != null) {
            return _HandCoinOutline!!
        }
        _HandCoinOutline = ImageVector.Builder(
            name = "HandCoinOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                curveTo(13.24f, 2f, 11f, 4.24f, 11f, 7f)
                reflectiveCurveTo(13.24f, 12f, 16f, 12f)
                reflectiveCurveTo(21f, 9.76f, 21f, 7f)
                reflectiveCurveTo(18.76f, 2f, 16f, 2f)
                moveTo(16f, 10f)
                curveTo(14.34f, 10f, 13f, 8.66f, 13f, 7f)
                reflectiveCurveTo(14.34f, 4f, 16f, 4f)
                reflectiveCurveTo(19f, 5.34f, 19f, 7f)
                reflectiveCurveTo(17.66f, 10f, 16f, 10f)
                moveTo(19f, 16f)
                horizontalLineTo(17f)
                curveTo(17f, 14.8f, 16.25f, 13.72f, 15.13f, 13.3f)
                lineTo(8.97f, 11f)
                horizontalLineTo(1f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(20.56f)
                lineTo(14f, 22.5f)
                lineTo(22f, 20f)
                verticalLineTo(19f)
                curveTo(22f, 17.34f, 20.66f, 16f, 19f, 16f)
                moveTo(5f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(20f)
                moveTo(13.97f, 20.41f)
                lineTo(7f, 18.5f)
                verticalLineTo(13f)
                horizontalLineTo(8.61f)
                lineTo(14.43f, 15.17f)
                curveTo(14.77f, 15.3f, 15f, 15.63f, 15f, 16f)
                curveTo(15f, 16f, 13f, 15.95f, 12.7f, 15.85f)
                lineTo(10.32f, 15.06f)
                lineTo(9.69f, 16.96f)
                lineTo(12.07f, 17.75f)
                curveTo(12.58f, 17.92f, 13.11f, 18f, 13.65f, 18f)
                horizontalLineTo(19f)
                curveTo(19.39f, 18f, 19.74f, 18.24f, 19.9f, 18.57f)
                lineTo(13.97f, 20.41f)
                close()
            }
        }.build()

        return _HandCoinOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HandCoinOutline: ImageVector? = null
