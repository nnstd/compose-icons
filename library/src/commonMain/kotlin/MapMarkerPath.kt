package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MapMarkerPath: ImageVector
    get() {
        if (_MapMarkerPath != null) {
            return _MapMarkerPath!!
        }
        _MapMarkerPath = ImageVector.Builder(
            name = "MapMarkerPath",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 21f)
                curveTo(16.69f, 21f, 15.58f, 20.17f, 15.17f, 19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(15.17f)
                curveTo(15.58f, 15.83f, 16.69f, 15f, 18f, 15f)
                moveTo(18f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 17f)
                moveTo(18f, 8f)
                arcTo(1.43f, 1.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.43f, 6.57f)
                curveTo(19.43f, 5.78f, 18.79f, 5.14f, 18f, 5.14f)
                curveTo(17.21f, 5.14f, 16.57f, 5.78f, 16.57f, 6.57f)
                arcTo(1.43f, 1.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                moveTo(18f, 2.57f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 6.57f)
                curveTo(22f, 9.56f, 18f, 14f, 18f, 14f)
                curveTo(18f, 14f, 14f, 9.56f, 14f, 6.57f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 2.57f)
                moveTo(8.83f, 17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(8.83f)
                curveTo(8.42f, 20.17f, 7.31f, 21f, 6f, 21f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18f)
                curveTo(3f, 16.69f, 3.83f, 15.58f, 5f, 15.17f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(15.17f)
                curveTo(7.85f, 15.47f, 8.53f, 16.15f, 8.83f, 17f)
                moveTo(6f, 17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 17f)
                moveTo(6f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 6f)
                curveTo(9f, 7.31f, 8.17f, 8.42f, 7f, 8.83f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(8.83f)
                curveTo(3.83f, 8.42f, 3f, 7.31f, 3f, 6f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 3f)
                moveTo(6f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5f)
                moveTo(11f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                moveTo(7f, 13f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _MapMarkerPath!!
    }

@Suppress("ObjectPropertyName")
private var _MapMarkerPath: ImageVector? = null
