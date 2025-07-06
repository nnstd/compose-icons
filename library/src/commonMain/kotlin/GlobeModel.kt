package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GlobeModel: ImageVector
    get() {
        if (_GlobeModel != null) {
            return _GlobeModel!!
        }
        _GlobeModel = ImageVector.Builder(
            name = "GlobeModel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.36f, 2.64f)
                lineTo(15.95f, 4.06f)
                curveTo(17.26f, 5.37f, 18f, 7.14f, 18f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 16f)
                curveTo(9.15f, 16f, 7.37f, 15.26f, 6.06f, 13.95f)
                lineTo(4.64f, 15.36f)
                curveTo(6.08f, 16.8f, 7.97f, 17.71f, 10f, 17.93f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                verticalLineTo(17.94f)
                curveTo(16.55f, 17.43f, 20f, 13.58f, 20f, 9f)
                curveTo(20f, 6.62f, 19.05f, 4.33f, 17.36f, 2.64f)
                moveTo(11f, 3.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 9f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 14.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 9f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 3.5f)
                moveTo(11f, 5.5f)
                curveTo(12.94f, 5.5f, 14.5f, 7.07f, 14.5f, 9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5.5f)
                close()
            }
        }.build()

        return _GlobeModel!!
    }

@Suppress("ObjectPropertyName")
private var _GlobeModel: ImageVector? = null
