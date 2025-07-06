package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignDirectionPlus: ImageVector
    get() {
        if (_SignDirectionPlus != null) {
            return _SignDirectionPlus!!
        }
        _SignDirectionPlus = ImageVector.Builder(
            name = "SignDirectionPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 20f)
                horizontalLineTo(13.09f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.81f, 22f)
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
                lineTo(20.5f, 9.5f)
                lineTo(18f, 12f)
                horizontalLineTo(13f)
                moveTo(18f, 15f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(23f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                horizontalLineTo(23f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _SignDirectionPlus!!
    }

@Suppress("ObjectPropertyName")
private var _SignDirectionPlus: ImageVector? = null
