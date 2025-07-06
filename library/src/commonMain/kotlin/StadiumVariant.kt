package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StadiumVariant: ImageVector
    get() {
        if (_StadiumVariant != null) {
            return _StadiumVariant!!
        }
        _StadiumVariant = ImageVector.Builder(
            name = "StadiumVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(7f)
                lineTo(10f, 5f)
                lineTo(7f, 7f)
                verticalLineTo(8.33f)
                curveTo(8.47f, 8.12f, 10.18f, 8f, 12f, 8f)
                curveTo(13.82f, 8f, 15.53f, 8.12f, 17f, 8.33f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                lineTo(22f, 5f)
                lineTo(19f, 7f)
                verticalLineTo(8.71f)
                curveTo(20.85f, 9.17f, 22f, 9.8f, 22f, 10.5f)
                curveTo(22f, 11.88f, 17.5f, 13f, 12f, 13f)
                curveTo(6.5f, 13f, 2f, 11.88f, 2f, 10.5f)
                curveTo(2f, 9.8f, 3.15f, 9.17f, 5f, 8.71f)
                verticalLineTo(3f)
                moveTo(12f, 9.5f)
                curveTo(8.69f, 9.5f, 7f, 9.67f, 7f, 10.5f)
                curveTo(7f, 11.33f, 8.69f, 11.5f, 12f, 11.5f)
                curveTo(15.31f, 11.5f, 17f, 11.33f, 17f, 10.5f)
                curveTo(17f, 9.67f, 15.31f, 9.5f, 12f, 9.5f)
                moveTo(12f, 14.75f)
                curveTo(15.81f, 14.75f, 19.2f, 14.08f, 21.4f, 13.05f)
                lineTo(20f, 21f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 17f)
                horizontalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                lineTo(2.6f, 13.05f)
                curveTo(4.8f, 14.08f, 8.19f, 14.75f, 12f, 14.75f)
                close()
            }
        }.build()

        return _StadiumVariant!!
    }

@Suppress("ObjectPropertyName")
private var _StadiumVariant: ImageVector? = null
