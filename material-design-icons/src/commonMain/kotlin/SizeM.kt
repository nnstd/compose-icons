package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SizeM: ImageVector
    get() {
        if (_SizeM != null) {
            return _SizeM!!
        }
        _SizeM = ImageVector.Builder(
            name = "SizeM",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                curveTo(7.9f, 7f, 7f, 7.9f, 7f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                curveTo(17f, 7.9f, 16.11f, 7f, 15f, 7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _SizeM!!
    }

@Suppress("ObjectPropertyName")
private var _SizeM: ImageVector? = null
