package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RayStartEnd: ImageVector
    get() {
        if (_RayStartEnd != null) {
            return _RayStartEnd!!
        }
        _RayStartEnd = ImageVector.Builder(
            name = "RayStartEnd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 9f)
                curveTo(5.31f, 9f, 6.42f, 9.83f, 6.83f, 11f)
                horizontalLineTo(17.17f)
                curveTo(17.58f, 9.83f, 18.69f, 9f, 20f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 15f)
                curveTo(18.69f, 15f, 17.58f, 14.17f, 17.17f, 13f)
                horizontalLineTo(6.83f)
                curveTo(6.42f, 14.17f, 5.31f, 15f, 4f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9f)
                close()
            }
        }.build()

        return _RayStartEnd!!
    }

@Suppress("ObjectPropertyName")
private var _RayStartEnd: ImageVector? = null
