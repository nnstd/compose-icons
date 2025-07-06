package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BackupRestore: ImageVector
    get() {
        if (_BackupRestore != null) {
            return _BackupRestore!!
        }
        _BackupRestore = ImageVector.Builder(
            name = "BackupRestore",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                horizontalLineTo(0f)
                lineTo(4f, 16f)
                lineTo(8f, 12f)
                horizontalLineTo(5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 5f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 12f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19f)
                curveTo(10.5f, 19f, 9.09f, 18.5f, 7.94f, 17.7f)
                lineTo(6.5f, 19.14f)
                curveTo(8.04f, 20.3f, 9.94f, 21f, 12f, 21f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                moveTo(14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                close()
            }
        }.build()

        return _BackupRestore!!
    }

@Suppress("ObjectPropertyName")
private var _BackupRestore: ImageVector? = null
