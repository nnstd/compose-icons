package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FuriganaVertical: ImageVector
    get() {
        if (_FuriganaVertical != null) {
            return _FuriganaVertical!!
        }
        _FuriganaVertical = ImageVector.Builder(
            name = "FuriganaVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(11.95f)
                curveTo(11.53f, 10.13f, 10.5f, 11.5f, 9.16f, 12.67f)
                curveTo(8.12f, 11.74f, 7.35f, 10.82f, 6.82f, 10f)
                horizontalLineTo(4.5f)
                curveTo(5.08f, 11.25f, 6.13f, 12.62f, 7.62f, 13.96f)
                lineTo(3.55f, 17.22f)
                lineTo(2.76f, 17.84f)
                lineTo(4f, 19.41f)
                lineTo(4.8f, 18.78f)
                lineTo(9.17f, 15.28f)
                lineTo(13.55f, 18.78f)
                lineTo(14.33f, 19.41f)
                lineTo(15.58f, 17.84f)
                lineTo(14.8f, 17.22f)
                lineTo(10.73f, 13.97f)
                curveTo(12.34f, 12.5f, 13.7f, 10.85f, 14.07f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                moveTo(19.5f, 6f)
                curveTo(18.12f, 6f, 17f, 7.12f, 17f, 8.5f)
                reflectiveCurveTo(18.12f, 11f, 19.5f, 11f)
                reflectiveCurveTo(22f, 9.88f, 22f, 8.5f)
                reflectiveCurveTo(20.88f, 6f, 19.5f, 6f)
                moveTo(19.47f, 13f)
                curveTo(18.09f, 13f, 16.97f, 14.12f, 16.97f, 15.5f)
                reflectiveCurveTo(18.09f, 18f, 19.47f, 18f)
                reflectiveCurveTo(21.97f, 16.88f, 21.97f, 15.5f)
                reflectiveCurveTo(20.85f, 13f, 19.47f, 13f)
                close()
            }
        }.build()

        return _FuriganaVertical!!
    }

@Suppress("ObjectPropertyName")
private var _FuriganaVertical: ImageVector? = null
