package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Podcast: ImageVector
    get() {
        if (_Podcast != null) {
            return _Podcast!!
        }
        _Podcast = ImageVector.Builder(
            name = "Podcast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 18.25f)
                verticalLineTo(21.5f)
                horizontalLineTo(7f)
                verticalLineTo(18.25f)
                curveTo(7f, 16.87f, 9.24f, 15.75f, 12f, 15.75f)
                curveTo(14.76f, 15.75f, 17f, 16.87f, 17f, 18.25f)
                moveTo(12f, 5.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 12f)
                curveTo(18.5f, 13.25f, 18.15f, 14.42f, 17.54f, 15.41f)
                lineTo(16f, 14.04f)
                curveTo(16.32f, 13.43f, 16.5f, 12.73f, 16.5f, 12f)
                curveTo(16.5f, 9.5f, 14.5f, 7.5f, 12f, 7.5f)
                curveTo(9.5f, 7.5f, 7.5f, 9.5f, 7.5f, 12f)
                curveTo(7.5f, 12.73f, 7.68f, 13.43f, 8f, 14.04f)
                lineTo(6.46f, 15.41f)
                curveTo(5.85f, 14.42f, 5.5f, 13.25f, 5.5f, 12f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5.5f)
                moveTo(12f, 1.5f)
                arcTo(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 12f)
                curveTo(22.5f, 14.28f, 21.77f, 16.39f, 20.54f, 18.11f)
                lineTo(19.04f, 16.76f)
                curveTo(19.96f, 15.4f, 20.5f, 13.76f, 20.5f, 12f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3.5f)
                arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 12f)
                curveTo(3.5f, 13.76f, 4.04f, 15.4f, 4.96f, 16.76f)
                lineTo(3.46f, 18.11f)
                curveTo(2.23f, 16.39f, 1.5f, 14.28f, 1.5f, 12f)
                arcTo(10.5f, 10.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1.5f)
                moveTo(12f, 9.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 12f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9.5f)
                close()
            }
        }.build()

        return _Podcast!!
    }

@Suppress("ObjectPropertyName")
private var _Podcast: ImageVector? = null
