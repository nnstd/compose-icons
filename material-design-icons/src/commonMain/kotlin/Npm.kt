package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Npm: ImageVector
    get() {
        if (_Npm != null) {
            return _Npm!!
        }
        _Npm = ImageVector.Builder(
            name = "Npm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(4f)
                moveTo(9f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(9f)
                moveTo(12f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                moveTo(14f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                moveTo(3f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _Npm!!
    }

@Suppress("ObjectPropertyName")
private var _Npm: ImageVector? = null
