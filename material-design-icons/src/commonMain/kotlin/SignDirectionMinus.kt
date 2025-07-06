package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignDirectionMinus: ImageVector
    get() {
        if (_SignDirectionMinus != null) {
            return _SignDirectionMinus!!
        }
        _SignDirectionMinus = ImageVector.Builder(
            name = "SignDirectionMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 9.5f)
                lineTo(18f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20f)
                verticalLineTo(12f)
                horizontalLineTo(3.5f)
                lineTo(6f, 9.5f)
                lineTo(3.5f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                lineTo(12f, 2f)
                lineTo(13f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                moveTo(23f, 18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                close()
            }
        }.build()

        return _SignDirectionMinus!!
    }

@Suppress("ObjectPropertyName")
private var _SignDirectionMinus: ImageVector? = null
