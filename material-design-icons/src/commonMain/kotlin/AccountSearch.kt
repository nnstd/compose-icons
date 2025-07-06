package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountSearch: ImageVector
    get() {
        if (_AccountSearch != null) {
            return _AccountSearch!!
        }
        _AccountSearch = ImageVector.Builder(
            name = "AccountSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 12f)
                curveTo(18f, 12f, 20f, 14f, 20f, 16.5f)
                curveTo(20f, 17.38f, 19.75f, 18.21f, 19.31f, 18.9f)
                lineTo(22.39f, 22f)
                lineTo(21f, 23.39f)
                lineTo(17.88f, 20.32f)
                curveTo(17.19f, 20.75f, 16.37f, 21f, 15.5f, 21f)
                curveTo(13f, 21f, 11f, 19f, 11f, 16.5f)
                curveTo(11f, 14f, 13f, 12f, 15.5f, 12f)
                moveTo(15.5f, 14f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 19f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 16.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 14f)
                moveTo(10f, 4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8f)
                curveTo(14f, 8.91f, 13.69f, 9.75f, 13.18f, 10.43f)
                curveTo(12.32f, 10.75f, 11.55f, 11.26f, 10.91f, 11.9f)
                lineTo(10f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 4f)
                moveTo(2f, 20f)
                verticalLineTo(18f)
                curveTo(2f, 15.88f, 5.31f, 14.14f, 9.5f, 14f)
                curveTo(9.18f, 14.78f, 9f, 15.62f, 9f, 16.5f)
                curveTo(9f, 17.79f, 9.38f, 19f, 10f, 20f)
                horizontalLineTo(2f)
                close()
            }
        }.build()

        return _AccountSearch!!
    }

@Suppress("ObjectPropertyName")
private var _AccountSearch: ImageVector? = null
