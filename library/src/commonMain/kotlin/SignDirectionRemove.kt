package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SignDirectionRemove: ImageVector
    get() {
        if (_SignDirectionRemove != null) {
            return _SignDirectionRemove!!
        }
        _SignDirectionRemove = ImageVector.Builder(
            name = "SignDirectionRemove",
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
                moveTo(21.12f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.46f)
                lineTo(15.46f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.46f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }.build()

        return _SignDirectionRemove!!
    }

@Suppress("ObjectPropertyName")
private var _SignDirectionRemove: ImageVector? = null
