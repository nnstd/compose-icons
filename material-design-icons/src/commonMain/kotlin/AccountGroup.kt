package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountGroup: ImageVector
    get() {
        if (_AccountGroup != null) {
            return _AccountGroup!!
        }
        _AccountGroup = ImageVector.Builder(
            name = "AccountGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 9f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5.5f)
                moveTo(5f, 8f)
                curveTo(5.56f, 8f, 6.08f, 8.15f, 6.53f, 8.42f)
                curveTo(6.38f, 9.85f, 6.8f, 11.27f, 7.66f, 12.38f)
                curveTo(7.16f, 13.34f, 6.16f, 14f, 5f, 14f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 8f)
                moveTo(19f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 11f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 14f)
                curveTo(17.84f, 14f, 16.84f, 13.34f, 16.34f, 12.38f)
                curveTo(17.2f, 11.27f, 17.62f, 9.85f, 17.47f, 8.42f)
                curveTo(17.92f, 8.15f, 18.44f, 8f, 19f, 8f)
                moveTo(5.5f, 18.25f)
                curveTo(5.5f, 16.18f, 8.41f, 14.5f, 12f, 14.5f)
                curveTo(15.59f, 14.5f, 18.5f, 16.18f, 18.5f, 18.25f)
                verticalLineTo(20f)
                horizontalLineTo(5.5f)
                verticalLineTo(18.25f)
                moveTo(0f, 20f)
                verticalLineTo(18.5f)
                curveTo(0f, 17.11f, 1.89f, 15.94f, 4.45f, 15.6f)
                curveTo(3.86f, 16.28f, 3.5f, 17.22f, 3.5f, 18.25f)
                verticalLineTo(20f)
                horizontalLineTo(0f)
                moveTo(24f, 20f)
                horizontalLineTo(20.5f)
                verticalLineTo(18.25f)
                curveTo(20.5f, 17.22f, 20.14f, 16.28f, 19.55f, 15.6f)
                curveTo(22.11f, 15.94f, 24f, 17.11f, 24f, 18.5f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _AccountGroup!!
    }

@Suppress("ObjectPropertyName")
private var _AccountGroup: ImageVector? = null
