package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileCloud: ImageVector
    get() {
        if (_FileCloud != null) {
            return _FileCloud!!
        }
        _FileCloud = ImageVector.Builder(
            name = "FileCloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                horizontalLineTo(18.5f)
                lineTo(13f, 3.5f)
                verticalLineTo(9f)
                moveTo(6f, 2f)
                horizontalLineTo(14f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.89f, 22f, 4f, 21.1f, 4f, 20f)
                verticalLineTo(4f)
                curveTo(4f, 2.89f, 4.89f, 2f, 6f, 2f)
                moveTo(15.68f, 15f)
                curveTo(15.34f, 13.3f, 13.82f, 12f, 12f, 12f)
                curveTo(10.55f, 12f, 9.3f, 12.82f, 8.68f, 14f)
                curveTo(7.17f, 14.18f, 6f, 15.45f, 6f, 17f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                horizontalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 17.5f)
                curveTo(18f, 16.18f, 16.97f, 15.11f, 15.68f, 15f)
                close()
            }
        }.build()

        return _FileCloud!!
    }

@Suppress("ObjectPropertyName")
private var _FileCloud: ImageVector? = null
