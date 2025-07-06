package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountChild: ImageVector
    get() {
        if (_AccountChild != null) {
            return _AccountChild!!
        }
        _AccountChild = ImageVector.Builder(
            name = "AccountChild",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                moveTo(12f, 9f)
                curveTo(13.63f, 9f, 15.12f, 9.35f, 16.5f, 10.05f)
                curveTo(17.84f, 10.76f, 18.5f, 11.61f, 18.5f, 12.61f)
                verticalLineTo(18.38f)
                curveTo(18.5f, 19.5f, 17.64f, 20.44f, 15.89f, 21.19f)
                verticalLineTo(19f)
                curveTo(15.89f, 18.05f, 15.03f, 17.38f, 13.31f, 16.97f)
                curveTo(12.75f, 16.84f, 12.31f, 16.78f, 12f, 16.78f)
                curveTo(11.13f, 16.78f, 10.3f, 16.95f, 9.54f, 17.3f)
                curveTo(8.77f, 17.64f, 8.31f, 18.08f, 8.16f, 18.61f)
                curveTo(9.5f, 19.14f, 10.78f, 19.41f, 12f, 19.41f)
                lineTo(13f, 19.31f)
                verticalLineTo(21.94f)
                lineTo(12f, 22f)
                curveTo(10.63f, 22f, 9.33f, 21.72f, 8.11f, 21.19f)
                curveTo(6.36f, 20.44f, 5.5f, 19.5f, 5.5f, 18.38f)
                verticalLineTo(12.61f)
                curveTo(5.5f, 11.61f, 6.16f, 10.76f, 7.5f, 10.05f)
                curveTo(8.88f, 9.35f, 10.38f, 9f, 12f, 9f)
                moveTo(12f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                close()
            }
        }.build()

        return _AccountChild!!
    }

@Suppress("ObjectPropertyName")
private var _AccountChild: ImageVector? = null
