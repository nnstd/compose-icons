package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TableColumn: ImageVector
    get() {
        if (_TableColumn != null) {
            return _TableColumn!!
        }
        _TableColumn = ImageVector.Builder(
            name = "TableColumn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 2f)
                horizontalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 22f)
                horizontalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                moveTo(8f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                moveTo(8f, 16f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                moveTo(8f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _TableColumn!!
    }

@Suppress("ObjectPropertyName")
private var _TableColumn: ImageVector? = null
