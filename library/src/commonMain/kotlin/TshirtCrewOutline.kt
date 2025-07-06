package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TshirtCrewOutline: ImageVector
    get() {
        if (_TshirtCrewOutline != null) {
            return _TshirtCrewOutline!!
        }
        _TshirtCrewOutline = ImageVector.Builder(
            name = "TshirtCrewOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 21f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 20f)
                verticalLineTo(12.07f)
                lineTo(5.7f, 13.12f)
                curveTo(5.31f, 13.5f, 4.68f, 13.5f, 4.29f, 13.12f)
                lineTo(1.46f, 10.29f)
                curveTo(1.07f, 9.9f, 1.07f, 9.27f, 1.46f, 8.88f)
                lineTo(7.34f, 3f)
                horizontalLineTo(9f)
                curveTo(9f, 4.1f, 10.34f, 5f, 12f, 5f)
                curveTo(13.66f, 5f, 15f, 4.1f, 15f, 3f)
                horizontalLineTo(16.66f)
                lineTo(22.54f, 8.88f)
                curveTo(22.93f, 9.27f, 22.93f, 9.9f, 22.54f, 10.29f)
                lineTo(19.71f, 13.12f)
                curveTo(19.32f, 13.5f, 18.69f, 13.5f, 18.3f, 13.12f)
                lineTo(17f, 12.07f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                moveTo(20.42f, 9.58f)
                lineTo(16.11f, 5.28f)
                curveTo(15.8f, 5.63f, 15.43f, 5.94f, 15f, 6.2f)
                curveTo(14.16f, 6.7f, 13.13f, 7f, 12f, 7f)
                curveTo(10.3f, 7f, 8.79f, 6.32f, 7.89f, 5.28f)
                lineTo(3.58f, 9.58f)
                lineTo(5f, 11f)
                lineTo(8f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                lineTo(19f, 11f)
                lineTo(20.42f, 9.58f)
                close()
            }
        }.build()

        return _TshirtCrewOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TshirtCrewOutline: ImageVector? = null
