package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccountMusic: ImageVector
    get() {
        if (_AccountMusic != null) {
            return _AccountMusic!!
        }
        _AccountMusic = ImageVector.Builder(
            name = "AccountMusic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 14f)
                curveTo(12f, 14f, 13.05f, 14.16f, 14.2f, 14.44f)
                curveTo(13.39f, 15.31f, 13f, 16.33f, 13f, 17.5f)
                curveTo(13f, 18.39f, 13.25f, 19.23f, 13.78f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                curveTo(3f, 16.81f, 3.91f, 15.85f, 5.74f, 15.12f)
                curveTo(7.57f, 14.38f, 9.33f, 14f, 11f, 14f)
                moveTo(11f, 12f)
                curveTo(9.92f, 12f, 9f, 11.61f, 8.18f, 10.83f)
                curveTo(7.38f, 10.05f, 7f, 9.11f, 7f, 8f)
                curveTo(7f, 6.92f, 7.38f, 6f, 8.18f, 5.18f)
                curveTo(9f, 4.38f, 9.92f, 4f, 11f, 4f)
                curveTo(12.11f, 4f, 13.05f, 4.38f, 13.83f, 5.18f)
                curveTo(14.61f, 6f, 15f, 6.92f, 15f, 8f)
                curveTo(15f, 9.11f, 14.61f, 10.05f, 13.83f, 10.83f)
                curveTo(13.05f, 11.61f, 12.11f, 12f, 11f, 12f)
                moveTo(18.5f, 10f)
                horizontalLineTo(20f)
                lineTo(22f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 20f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 15f)
                curveTo(17.86f, 15f, 18.19f, 15.07f, 18.5f, 15.21f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _AccountMusic!!
    }

@Suppress("ObjectPropertyName")
private var _AccountMusic: ImageVector? = null
