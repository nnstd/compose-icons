package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableChair: ImageVector
    get() {
        if (_TableChair != null) {
            return _TableChair!!
        }
        _TableChair = ImageVector.Builder(
            name = "TableChair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 20f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                moveTo(22f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _TableChair!!
    }

@Suppress("ObjectPropertyName")
private var _TableChair: ImageVector? = null
