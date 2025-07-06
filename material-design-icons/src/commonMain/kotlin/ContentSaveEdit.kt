package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ContentSaveEdit: ImageVector
    get() {
        if (_ContentSaveEdit != null) {
            return _ContentSaveEdit!!
        }
        _ContentSaveEdit = ImageVector.Builder(
            name = "ContentSaveEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 19f)
                lineTo(10.14f, 18.86f)
                curveTo(8.9f, 18.5f, 8f, 17.36f, 8f, 16f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 13f)
                curveTo(12.36f, 13f, 13.5f, 13.9f, 13.86f, 15.14f)
                lineTo(20f, 9f)
                verticalLineTo(7f)
                lineTo(16f, 3f)
                horizontalLineTo(4f)
                curveTo(2.89f, 3f, 2f, 3.9f, 2f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 21f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                moveTo(4f, 5f)
                horizontalLineTo(14f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                moveTo(20.04f, 12.13f)
                curveTo(19.9f, 12.13f, 19.76f, 12.19f, 19.65f, 12.3f)
                lineTo(18.65f, 13.3f)
                lineTo(20.7f, 15.35f)
                lineTo(21.7f, 14.35f)
                curveTo(21.92f, 14.14f, 21.92f, 13.79f, 21.7f, 13.58f)
                lineTo(20.42f, 12.3f)
                curveTo(20.31f, 12.19f, 20.18f, 12.13f, 20.04f, 12.13f)
                moveTo(18.07f, 13.88f)
                lineTo(12f, 19.94f)
                verticalLineTo(22f)
                horizontalLineTo(14.06f)
                lineTo(20.12f, 15.93f)
                lineTo(18.07f, 13.88f)
                close()
            }
        }.build()

        return _ContentSaveEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ContentSaveEdit: ImageVector? = null
