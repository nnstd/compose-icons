package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeightPound: ImageVector
    get() {
        if (_WeightPound != null) {
            return _WeightPound!!
        }
        _WeightPound = ImageVector.Builder(
            name = "WeightPound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 7f)
                curveTo(16f, 7.73f, 15.81f, 8.41f, 15.46f, 9f)
                horizontalLineTo(18f)
                curveTo(18.95f, 9f, 19.75f, 9.67f, 19.95f, 10.56f)
                curveTo(21.96f, 18.57f, 22f, 18.78f, 22f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                curveTo(2f, 18.78f, 2.04f, 18.57f, 4.05f, 10.56f)
                curveTo(4.25f, 9.67f, 5.05f, 9f, 6f, 9f)
                horizontalLineTo(8.54f)
                curveTo(8.19f, 8.41f, 8f, 7.73f, 8f, 7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                moveTo(12f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                moveTo(6f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                moveTo(13f, 11f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                curveTo(17.11f, 19f, 18f, 18.11f, 18f, 17f)
                verticalLineTo(16.5f)
                curveTo(18f, 15.93f, 17.75f, 15.38f, 17.32f, 15f)
                curveTo(17.75f, 14.62f, 18f, 14.07f, 18f, 13.5f)
                verticalLineTo(13f)
                curveTo(18f, 11.89f, 17.11f, 11f, 16f, 11f)
                horizontalLineTo(13f)
                moveTo(15f, 13f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                moveTo(15f, 16f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _WeightPound!!
    }

@Suppress("ObjectPropertyName")
private var _WeightPound: ImageVector? = null
