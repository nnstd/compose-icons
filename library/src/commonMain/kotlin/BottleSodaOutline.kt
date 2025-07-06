package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleSodaOutline: ImageVector
    get() {
        if (_BottleSodaOutline != null) {
            return _BottleSodaOutline!!
        }
        _BottleSodaOutline = ImageVector.Builder(
            name = "BottleSodaOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.4f, 9.58f)
                curveTo(12.9f, 7.89f, 13f, 4f, 13f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                reflectiveCurveTo(11.1f, 7.89f, 9.6f, 9.58f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 11f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 22f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.4f, 9.58f)
                moveTo(13f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                lineTo(11.1f, 10.91f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9.5f)
                arcTo(6.26f, 6.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.9f, 10.91f)
                lineTo(13f, 11f)
                close()
            }
        }.build()

        return _BottleSodaOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BottleSodaOutline: ImageVector? = null
