package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RegisteredTrademark: ImageVector
    get() {
        if (_RegisteredTrademark != null) {
            return _RegisteredTrademark!!
        }
        _RegisteredTrademark = ImageVector.Builder(
            name = "RegisteredTrademark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                moveTo(12f, 20f)
                curveTo(7.59f, 20f, 4f, 16.41f, 4f, 12f)
                curveTo(4f, 7.59f, 7.59f, 4f, 12f, 4f)
                curveTo(16.41f, 4f, 20f, 7.59f, 20f, 12f)
                curveTo(20f, 16.41f, 16.41f, 20f, 12f, 20f)
                moveTo(12.25f, 13.27f)
                horizontalLineTo(10.81f)
                verticalLineTo(16.5f)
                horizontalLineTo(9f)
                verticalLineTo(7.71f)
                horizontalLineTo(12.26f)
                curveTo(13.29f, 7.71f, 14.09f, 7.94f, 14.66f, 8.4f)
                curveTo(15.22f, 8.87f, 15.5f, 9.5f, 15.5f, 10.36f)
                curveTo(15.5f, 10.96f, 15.37f, 11.46f, 15.11f, 11.86f)
                curveTo(14.85f, 12.26f, 14.46f, 12.58f, 13.93f, 12.81f)
                lineTo(15.83f, 16.4f)
                verticalLineTo(16.5f)
                horizontalLineTo(13.89f)
                lineTo(12.25f, 13.27f)
                moveTo(10.81f, 11.81f)
                horizontalLineTo(12.27f)
                curveTo(12.72f, 11.81f, 13.07f, 11.69f, 13.32f, 11.46f)
                curveTo(13.57f, 11.23f, 13.69f, 10.91f, 13.69f, 10.5f)
                curveTo(13.69f, 10.09f, 13.58f, 9.77f, 13.34f, 9.53f)
                curveTo(13.11f, 9.29f, 12.75f, 9.18f, 12.26f, 9.18f)
                horizontalLineTo(10.81f)
                verticalLineTo(11.81f)
                close()
            }
        }.build()

        return _RegisteredTrademark!!
    }

@Suppress("ObjectPropertyName")
private var _RegisteredTrademark: ImageVector? = null
