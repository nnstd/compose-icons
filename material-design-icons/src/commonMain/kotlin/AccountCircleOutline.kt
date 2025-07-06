package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountCircleOutline: ImageVector
    get() {
        if (_AccountCircleOutline != null) {
            return _AccountCircleOutline!!
        }
        _AccountCircleOutline = ImageVector.Builder(
            name = "AccountCircleOutline",
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
                moveTo(7.07f, 18.28f)
                curveTo(7.5f, 17.38f, 10.12f, 16.5f, 12f, 16.5f)
                curveTo(13.88f, 16.5f, 16.5f, 17.38f, 16.93f, 18.28f)
                curveTo(15.57f, 19.36f, 13.86f, 20f, 12f, 20f)
                curveTo(10.14f, 20f, 8.43f, 19.36f, 7.07f, 18.28f)
                moveTo(18.36f, 16.83f)
                curveTo(16.93f, 15.09f, 13.46f, 14.5f, 12f, 14.5f)
                curveTo(10.54f, 14.5f, 7.07f, 15.09f, 5.64f, 16.83f)
                curveTo(4.62f, 15.5f, 4f, 13.82f, 4f, 12f)
                curveTo(4f, 7.59f, 7.59f, 4f, 12f, 4f)
                curveTo(16.41f, 4f, 20f, 7.59f, 20f, 12f)
                curveTo(20f, 13.82f, 19.38f, 15.5f, 18.36f, 16.83f)
                moveTo(12f, 6f)
                curveTo(10.06f, 6f, 8.5f, 7.56f, 8.5f, 9.5f)
                curveTo(8.5f, 11.44f, 10.06f, 13f, 12f, 13f)
                curveTo(13.94f, 13f, 15.5f, 11.44f, 15.5f, 9.5f)
                curveTo(15.5f, 7.56f, 13.94f, 6f, 12f, 6f)
                moveTo(12f, 11f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 9.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
                close()
            }
        }.build()

        return _AccountCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AccountCircleOutline: ImageVector? = null
