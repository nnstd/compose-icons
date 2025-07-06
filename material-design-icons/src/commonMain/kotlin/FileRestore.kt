package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileRestore: ImageVector
    get() {
        if (_FileRestore != null) {
            return _FileRestore!!
        }
        _FileRestore = ImageVector.Builder(
            name = "FileRestore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(12f, 18f)
                curveTo(9.95f, 18f, 8.19f, 16.76f, 7.42f, 15f)
                horizontalLineTo(9.13f)
                curveTo(9.76f, 15.9f, 10.81f, 16.5f, 12f, 16.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 13f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 9.5f)
                curveTo(10.65f, 9.5f, 9.5f, 10.28f, 8.9f, 11.4f)
                lineTo(10.5f, 13f)
                horizontalLineTo(6.5f)
                verticalLineTo(9f)
                lineTo(7.8f, 10.3f)
                curveTo(8.69f, 8.92f, 10.23f, 8f, 12f, 8f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 13f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                close()
            }
        }.build()

        return _FileRestore!!
    }

@Suppress("ObjectPropertyName")
private var _FileRestore: ImageVector? = null
