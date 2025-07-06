package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FuriganaHorizontal: ImageVector
    get() {
        if (_FuriganaHorizontal != null) {
            return _FuriganaHorizontal!!
        }
        _FuriganaHorizontal = ImageVector.Builder(
            name = "FuriganaHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 2f)
                curveTo(7.12f, 2f, 6f, 3.12f, 6f, 4.5f)
                reflectiveCurveTo(7.12f, 7f, 8.5f, 7f)
                reflectiveCurveTo(11f, 5.88f, 11f, 4.5f)
                reflectiveCurveTo(9.88f, 2f, 8.5f, 2f)
                moveTo(15.5f, 2f)
                curveTo(14.12f, 2f, 13f, 3.12f, 13f, 4.5f)
                reflectiveCurveTo(14.12f, 7f, 15.5f, 7f)
                reflectiveCurveTo(18f, 5.88f, 18f, 4.5f)
                reflectiveCurveTo(16.88f, 2f, 15.5f, 2f)
                moveTo(11f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(14.95f)
                curveTo(14.53f, 13.13f, 13.5f, 14.5f, 12.16f, 15.67f)
                curveTo(11.12f, 14.74f, 10.35f, 13.82f, 9.82f, 13f)
                horizontalLineTo(7.5f)
                curveTo(8.08f, 14.25f, 9.13f, 15.62f, 10.62f, 16.96f)
                lineTo(6.55f, 20.22f)
                lineTo(5.76f, 20.84f)
                lineTo(7f, 22.41f)
                lineTo(7.8f, 21.78f)
                lineTo(12.17f, 18.28f)
                lineTo(16.55f, 21.78f)
                lineTo(17.33f, 22.41f)
                lineTo(18.58f, 20.84f)
                lineTo(17.8f, 20.22f)
                lineTo(13.73f, 16.97f)
                curveTo(15.34f, 15.5f, 16.7f, 13.85f, 17.07f, 12f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _FuriganaHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _FuriganaHorizontal: ImageVector? = null
