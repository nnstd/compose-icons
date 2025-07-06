package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Help: ImageVector
    get() {
        if (_Help != null) {
            return _Help!!
        }
        _Help = ImageVector.Builder(
            name = "Help",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(12f, 2f)
                curveTo(17.35f, 2.22f, 19.68f, 7.62f, 16.5f, 11.67f)
                curveTo(15.67f, 12.67f, 14.33f, 13.33f, 13.67f, 14.17f)
                curveTo(13f, 15f, 13f, 16f, 13f, 17f)
                horizontalLineTo(10f)
                curveTo(10f, 15.33f, 10f, 13.92f, 10.67f, 12.92f)
                curveTo(11.33f, 11.92f, 12.67f, 11.33f, 13.5f, 10.67f)
                curveTo(15.92f, 8.43f, 15.32f, 5.26f, 12f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                horizontalLineTo(6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.build()

        return _Help!!
    }

@Suppress("ObjectPropertyName")
private var _Help: ImageVector? = null
