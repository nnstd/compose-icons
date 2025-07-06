package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableSearch: ImageVector
    get() {
        if (_TableSearch != null) {
            return _TableSearch!!
        }
        _TableSearch = ImageVector.Builder(
            name = "TableSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.3f, 17.89f)
                curveTo(20.62f, 15.79f, 20f, 13f, 17.89f, 11.68f)
                curveTo(15.79f, 10.36f, 13f, 11f, 11.68f, 13.09f)
                curveTo(10.36f, 15.2f, 11f, 18f, 13.09f, 19.3f)
                curveTo(14.56f, 20.22f, 16.42f, 20.22f, 17.89f, 19.3f)
                lineTo(21f, 22.39f)
                lineTo(22.39f, 21f)
                lineTo(19.3f, 17.89f)
                moveTo(17.3f, 17.27f)
                curveTo(16.32f, 18.25f, 14.74f, 18.24f, 13.76f, 17.27f)
                curveTo(12.79f, 16.29f, 12.79f, 14.71f, 13.77f, 13.73f)
                curveTo(14.74f, 12.76f, 16.32f, 12.76f, 17.3f, 13.73f)
                curveTo(18.26f, 14.72f, 18.25f, 16.3f, 17.27f, 17.27f)
                horizontalLineTo(17.3f)
                moveTo(19f, 4f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                horizontalLineTo(10.81f)
                curveTo(10.25f, 19.42f, 9.8f, 18.74f, 9.5f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(14f)
                horizontalLineTo(9.18f)
                curveTo(9.34f, 13.29f, 9.61f, 12.61f, 10f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(10.81f)
                curveTo(11.58f, 10.25f, 12.26f, 9.8f, 13f, 9.5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                curveTo(19.4f, 10.25f, 19.77f, 10.55f, 20.1f, 10.88f)
                curveTo(20.44f, 11.22f, 20.74f, 11.59f, 21f, 12f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                close()
            }
        }.build()

        return _TableSearch!!
    }

@Suppress("ObjectPropertyName")
private var _TableSearch: ImageVector? = null
